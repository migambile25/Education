#!/bin/bash
# Lab 1 - Task 4: search and filtering

cd ~ || exit
shopt -s globstar

echo "=== a) char count, files ending '8', sorted ascending, errors merged into stdout ==="
wc -c $(ls -d -p lab0/**/*8 | grep -v '/$') 2>&1 | sort -n

echo
echo "=== b) filenames in huntail8, sorted z->a, errors to /tmp ==="
ls -r lab0/huntail8 2> /tmp/task4b_errors.log

echo
echo "=== c) content with line numbers, exclude lines containing 've', errors to /tmp ==="
cat -n lab0/huntail8/piplup lab0/huntail8/lillipup lab0/scyther9/cofagrigus 2> /tmp/task4c_errors.log | grep -v 've'

echo
echo "=== d) content, exclude lines ending in 'e' (case-insensitive), errors merged into stdout ==="
cat lab0/grotle2/sandile lab0/huntail8/piplup lab0/huntail8/lillipup lab0/scyther9/cofagrigus 2>&1 | grep -vi 'e$'

echo
echo "=== e) line counts, sorted descending, errors suppressed ==="
wc -l lab0/grotle2/accelgor lab0/grotle2/sandile 2>/dev/null | sort -rn

echo
echo "=== f) first 2 entries, files ending 'l', sorted by hard-link count ascending, errors not redirected ==="
ls -ld lab0/**/*l | grep -v '^d' | sort -k2,2n | head -n 2
