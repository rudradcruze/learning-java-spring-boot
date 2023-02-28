# Java Installation
### Download Java From Oracle
Go to the official website of oracle java corporation then download the latest version according to your operating system. <br>
[Java Downloads | Oracle](https://www.oracle.com/java/technologies/downloads/)

## Ubuntu Environment (version 22.04)

[Java download for linux](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

Go to the link then choose debian package download or just use the link below.

[Linux download jdk-19_linux-x64_bin.deb](https://download.oracle.com/java/19/latest/jdk-19_windows-x64_bin.exe )

After download go to the download directory and then run the terminal in the download directory. To do that just right-click then open in the terminal. <br>
![Right click to open in terminal](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/terminal-open.png)

Then run the below commands:
```shell
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

[Java download for windows](https://www.oracle.com/java/technologies/downloads/#jdk19-linux)

Go to the link then choose x64 Installer download or just use the link below.

[windows download x64 Installer (jdk-19_windows-x64_bin)](https://download.oracle.com/java/19/latest/jdk-19_windows-x64_bin.exe )

Follow the below steps:
1. Step 1: Right click and run as administrator to install
![Java Download](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/java-windows.png) <br>

2. Step 2: Go to Environment Variables and then choose Environment Variables
![Find Enviroment Variable](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/windows-find-envirornment-variable.png) <br>

![Windows system propertices](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/windows-system-propertices.png)

3. Step 3: On user variable section click **new** <br>
    **Variable Name:** `JAVA_HOME` <br>
    **Variable Value:** `C:\Program Files\Java\jdk-19` <br>

![Windows user variable](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/windows-user-variable.png) <br>

![Windows jdk path](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/windows-jdk-19-path.png) <br>

![windows java home](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/windows-java-home.png)

4. Step 4: Go to the System Variable section double click on the **path** then choose new and paste these command `%JAVA_HOME%\bin` <br>

![windows system path](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/windows-system-path.png) <br>

![windows system variable path new](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/windows-path-new.png)
<br>

---
# Eclipse Installation
## Ubuntu Environment (version 22.04)

[Eclipse IDE 2022-12 R Packages](https://www.eclipse.org/downloads/packages/)

Go to the link then choose [x86_64](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-12/R/eclipse-inst-jre-linux64.tar.gz) package download or just use the link below. <br>

[Linux download eclipse-inst-jre-linux64.tar.gz](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-12/R/eclipse-inst-jre-linux64.tar.gz)

After download go to the download directory then run the terminal in the download directory. To do that just right-click then open in the terminal.
![Right click to open in terminal](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/terminal-open.png)

After that run the below commands:
```shell
tar -xvzf eclipse-inst-jre-linux64.tar.gz
cd eclipse-installer/ 
./eclipse-inst
```

Then choose **`Eclipse IDE for Enterprise Java and Web Developers`**
![Eclipse IDE for Enterprise Java and Web Developers](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/eclipes-for-developers.png)

## Windows Environment (version 22.04)

[Eclipse IDE 2022-12 R Packages](https://www.eclipse.org/downloads/packages/)

Go to the link then choose [x86_64](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-12/R/eclipse-inst-jre-win64.exe) package download or just use the link below.

[Windows download eclipse-inst-jre-win64.exe](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-12/R/eclipse-inst-jre-win64.exe)

Go to the download directory and then right click then run as administrator. After that, a dialog box will appear then choose Eclipse IDE for **`Enterprise Java and Web Developers`** <br>

![Eclipse IDE for Enterprise Java and Web Developers](https://github.com/rudradcruze/learning-java-spring-boot/blob/main/images/eclipes-for-developers.png)
