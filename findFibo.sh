#!/bin/bash

findFibo(){
	a=0
	b=1
	echo -n "Fibonnaci terms: "
	echo -n "$a $b "
	for((i=2; i<=$1; i++))
	do
		c=$((a+b))
		echo -n " $c "
		a=$b
		b=$c
	done
}

read -p "Enter no of terms: " a
findFibo $a
echo

