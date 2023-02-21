# Java Installation
### Download Java From Oracle
Go to the official website of oracle java corporation then download the latest version according to your operating system. <br>
[Java Downloads | Oracle](https://www.oracle.com/java/technologies/downloads/)

## Ubuntu Environment (version 22.04)

[Java download for linux](https://www.oracle.com/java/technologies/downloads/#jdk19-linux)

Go to the link then choose debian package download or just use the link below.

[Linux download jdk-19_linux-x64_bin.deb](https://download.oracle.com/java/19/latest/jdk-19_linux-x64_bin.deb)

After download go to the download directory and then run the terminal in the download directory. To do that just right-click then open in the terminal. <br>
![Right click to open in terminal](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/terminal-open.png)

Then run the below commands:
```
sudo dpkg -i jdk-19_linux-x64_bin.deb

sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-19/bin/java 1

sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-19/bin/javac 1

sudo gedit /etc/environment
```

After running the last command a dialog box will appear then paste the following line into the editor then hit save and close.
```
JAVA_HOME="/usr/lib/jvm/jdk-19"
```
![Set Java Home](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/java-home-enviornment.png)

## Windows Environment (version 22.04)

# Eclipse Installation
## Ubuntu Environment (version 22.04)

[Eclipse IDE 2022-12 R Packages](https://www.eclipse.org/downloads/packages/)

Go to the link then choose [x86_64](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-12/R/eclipse-inst-jre-linux64.tar.gz) package download or just use the link below. <br>

[Linux download eclipse-inst-jre-linux64.tar.gz](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-12/R/eclipse-inst-jre-linux64.tar.gz)

After download go to the download directory then run the terminal in the download directory. To do that just right-click then open in the terminal.
![Right click to open in terminal](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/terminal-open.png)

After that run the below commands:
```
tar -xvzf eclipse-inst-jre-linux64.tar.gz

cd eclipse-installer/ 

./eclipse-inst
```

Then choose `Eclipse IDE for Enterprise Java and Web Developers`
![Eclipse IDE for Enterprise Java and Web Developers](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/eclipes-for-developers.png)

## Windows Environment (version 22.04)