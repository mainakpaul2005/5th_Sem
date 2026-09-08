public class Calculator {
    float n1,n2,n3,n4;

    public Calculator(float n1, float n2, float n3, float n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public Calculator(float n1, float n2, float n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Calculator(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2;
        
    }

    public float addNums(float n1, float n2) {
        return n1 + n2;
    }

    public float addNums(float n1, float n2, float n3) {
        return n1 + n2 + n3;
    }

    public float addNums(float n1, float n2, float n3, float n4) {
        return n1 + n2 + n3 + n4;
    }

    public float mulNums(float n1, float n2) {
        return n1 * n2;
    }

    public float mulNums(float n1, float n2, float n3) {
        return n1 * n2 * n3;
    }

    public float mulNums(float n1, float n2, float n3, float n4) {
        return n1 * n2 * n3 * n4;
    }
}
