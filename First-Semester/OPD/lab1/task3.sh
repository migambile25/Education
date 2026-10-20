#!/bin/bash
# Lab 1 - Task 3: copying and links

cd ~ || exit

# copy the content of mareep8
cat lab0/mareep8 > lab0/huntail8/lillipupmareep

# copy the file mareep8 into lab0/grotle2/cloyster
cp lab0/mareep8 lab0/grotle2/cloyster

# merge scyther9/cofagrigus and grotle2/accelgor into lab0/mareep8_68
cat lab0/scyther9/cofagrigus lab0/grotle2/accelgor > lab0/mareep8_68

# hard link to mareep8
ln lab0/mareep8 lab0/grotle2/accelgormareep

# symbolic link to azurill5
ln -s "$(pwd)/lab0/azurill5" lab0/scyther9/claydolazurill

# recursively copy huntail8 into huntail8/mightyena (bound to fail - expected)
cp -r lab0/huntail8 lab0/huntail8/mightyena

# symbolic link to the scyther9 directory
ln -s scyther9 lab0/Copy_64

# verify
ls -l lab0 lab0/grotle2 lab0/huntail8 lab0/scyther9
