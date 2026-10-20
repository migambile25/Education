#!/bin/bash
# Lab 1 - Task 2: set permissions with chmod

cd ~ || exit

chmod 640 lab0/azurill5
chmod 002 lab0/gabite0
chmod 576 lab0/grotle2
chmod 307 lab0/grotle2/cloyster
chmod 622 lab0/grotle2/accelgor
chmod 006 lab0/grotle2/sandile
chmod 711 lab0/huntail8
chmod 444 lab0/huntail8/piplup
chmod 752 lab0/huntail8/mightyena
chmod 006 lab0/huntail8/lillipup
chmod 524 lab0/huntail8/wingull
chmod 062 lab0/mareep8
chmod 571 lab0/scyther9
chmod 062 lab0/scyther9/cofagrigus
chmod 600 lab0/scyther9/dustox
chmod 600 lab0/scyther9/claydol

# verify permissions
ls -lR lab0
