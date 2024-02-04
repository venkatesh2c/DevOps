#!/bin/bash

for i in {1..3}; do
	if [ $i -eq 1 ]; then
		word="One"
	elif [ $i -eq 2 ]; then
		word="Two"
	elif [ $i -eq 3 ]; then 
		word="Three"
	else
		word="Unknown"
	fi
	echo " Hello $i $word"
done
