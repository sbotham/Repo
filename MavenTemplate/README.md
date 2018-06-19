The one project in github that is using JenkinsFile for
build

resides at:-
https://github.com/sbotham/Repo		account is sbotham@arccorp.com









Create a maven project
add 1 dependency

right click
team 
share project



Project location..
C:\Java\WS\MavenTemplate			<- Workspace


Git location					<- Local git repo.. Automatically adds project name
c:\git\Repo



Github..
Create new repo.. called Repo..

https://github.com/sbotham/Repo.git
will create
Repo / MavenTemplate /  on git hub when pushed






Locally

c:\git\Repo\MavenTemplate




Remote

sbotham@arccorp.com\Repo\MavenTemplate








If project doesnt build in IDE/STS due to lombok errors,
follow instructions for re-adding lombok to STS

https://stackoverflow.com/questions/35842751/lombok-not-working-with-sts



to do:-

1. create email add this to jenkins container/config

	jenkins4813@gmail.com use 231saleln@gmail.com for now


System-ids

B_SYSTEM_NAME=231saleln
B_SYSTEM_NAME=fncserver
B_SYSTEM_NAME=fncserver2
B_SYSTEM_NAME=skutter
B_SYSTEM_NAME=hp-dev-0001
B_SYSTEM_NAME=hp-build-0001


B_CONFIG_ROOT

Other useful vars set by system

HOSTNAME=system id or docker image id for docker containers



2. set a var to id ubuntu box
	edit /etc/environment and add B_SYSTEM_NAME=hp-build-0001	DONE

3. set a var to id jenkins container
	pass to docker run as -e B_SYSTEM_NAME=hp-build-0001(jenkins-0001)

4. make all dockers ip cons static								DONE
		create internal net
		docker network create --subnet=172.18.0.0/16 bothamnet
		then use --ip 172.18.0.100     101    102 etc
		

5. set up sonar													DONE
		properly resolve link to sonar from jenkins

6. add email notification for start / shutdown of build box

7. external access for ssh to ubuntu							DONE
	open port 22 on router to point to hp-build 
		switch off as was getting port scanned, need to protect against that.
	
8. auto start docker cons on restart of ubuntu					DONE
	see docker --restart option

9. build on scm change , can u control which files trigger build ?? i.e dont build on change of readme

10. centralize jenkins file see email 231saleln@gmail.com

	https://dev.to/jalogut/centralise-jenkins-pipelines-configuration-using-shared-libraries
	
11. add linux files to source control.
		use git to check these in from skutter					DONE
		scripts to run docker cons etc
		
12. auto populate commit message in STS							DONE
		1. install mylyn plugin
		2. window/prefs/myln/team  set commit message
		3. start a task and make active (view mylyn/tasklist/create)  right click and activate
		4. 
		

13. create shortcut to run putty and connect to HP-BUILD		DONE
update shortcut
"C:\Program Files\PuTTY\putty.exe" -load "HP-BUILD"    <- profile name

14. setup SSH keys and auto login from putty.					DONE

15. preserve/backup all docker container persistent storage on host hp-build
 		for
 			jenkins
 			sonar
 			nexus etc

16. dont send emails to sbotham@arccorp.com from hp-build-jenkins		DONE

17. send console log on build failure 								





