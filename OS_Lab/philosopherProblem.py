# Importing required libraries
import threading
import time

# Constants
N = 10
THINKING = 2
HUNGRY = 1
EATING = 0
times = 200

# Philosopher index
phil = [i for i in range(N)]


class Monitor:
    def __init__(self):
        # state of the philosopher
        self.state = [THINKING] * N

        # Philosopher condition variable
        self.phcond = [threading.Condition() for _ in range(N)]

    # Test for the desired condition
    # i.e. Left and Right philosopher are not eating
    def test(self, phnum):
        with self.phcond[phnum]:
            if (self.state[(phnum + 1) % N] != EATING and
                self.state[(phnum + N - 1) % N] != EATING and
                    self.state[phnum] == HUNGRY):
                self.state[phnum] = EATING
                self.phcond[phnum].notify()

    # Take Fork function
    def take_fork(self, phnum):
        with self.phcond[phnum]:
            # Indicates it is hungry
            self.state[phnum] = HUNGRY

            # test for condition
            self.test(phnum)

            # If unable to eat.. wait for the signal
            if self.state[phnum] != EATING:
                self.phcond[phnum].wait()
            print(f"Philosopher {phnum} is Eating")

    # Put Fork function
    def put_fork(self, phnum):
        with self.phcond[phnum]:
            # Indicates that I am thinking
            self.state[phnum] = THINKING

            self.test((phnum + 1) % N)
            self.test((phnum + N - 1) % N)


# Global Object of the monitor
phil_object = Monitor()


def philosopher(phnum):
    c = 0
    while c < times:
        time.sleep(1)
        phil_object.take_fork(phnum)
        time.sleep(0.5)
        phil_object.put_fork(phnum)
        c += 1


def main():
    # Creating...
    threads = []
    for i in range(N):
        t = threading.Thread(target=philosopher, args=(phil[i],))
        threads.append(t)
        t.start()
        print(f"Philosopher {i + 1} is thinking...")

    # Joining....
    for i in range(N):
        threads[i].join()


if __name__ == "__main__":
    main()