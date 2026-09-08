#!/bin/bash

findFact(){
	fact=1
	for((i=2; i<=$1; i++))
	do
		fact=$((fact*i))
	done
	echo "$fact"
}

read -p "Enter a num: " a
a=$(findFact a )
echo "Fact: $a"

