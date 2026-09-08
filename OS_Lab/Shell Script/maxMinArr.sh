#!/bin/bash

function maxMin()
{
    max=$1 # Always initialize to first element of array incase of MAx Min finding
    min=$1 # $1 refers to first element, and the number reflects the position in array, $3 is third elements and so on

    for i in "${array[@]}"
    do
        if [ "$i" -gt "$max" ]
        then
            max="$i"
        fi
        if [ "$i" -lt "$min" ]
        then
            min="$i"
        fi
    done

    echo "Maximum: $max"
    echo "Minimum: $min"
}

array=(10 20 3 40 500 97)
maxMin "${array[@]}"