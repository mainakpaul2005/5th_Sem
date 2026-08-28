#!/bin/bash

findAvg(){
	local sum=0
	local len="$#"
	for num in "$@"
	do
		sum=$((sum+num))
		avg=$((sum/len))
	done
	echo "$avg"
}

read -p "Enter first num: " a
read -p "Enter second num: " b
read -p "Enter third num: " c
a=$(findAvg a b c)
echo "Avg: $a"

