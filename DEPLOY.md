# Releasing a new version to Maven Central Repository

Plaid-java is available at [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cplaid-java)

## Setting up your Sonatype account

To deploy a new version, you need a Sonatype account. 
Sign up for an account [here](https://issues.sonatype.org/secure/Signup!default.jspa) with your plaid.com email.

Afterwards, ask someone (davidzhanghp@) to file a ticket like [OSSRH-39496](https://issues.sonatype.org/browse/OSSRH-39496) for you.

This may take some time as we rely on folks at Sonatype to do this for us, so please be patient.

## Setting up ~/.m2/settings.xml
We need to take your credentials from Sonatype and add it to your `~/.m2/settings.xml`. Maven reads `~/.m2/settings.xml` for user-specific configuration.

Using the editor of your choice, paste this into your `~/.m2/settings.xml` file, replacing the username and password.

Fun fact: XML won't like it if your password contains illegal XML characters, so you probably need to escape it. Alternatively, just change your password to be more XML-friendly.

```
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>sonatypeusername</username>
      <password>>>iLoveHotPot123!@HenrysHunan</password>
    </server>
  </servers>
  <profiles>
    <profile>
      <id>ossrh</id>
      <activation>
        <activeByDefault>true</activeByDefault>
      </activation>
      <properties>
        <gpg.executable>gpg2</gpg.executable>
        <gpg.useagent>true</gpg.useagent>
      </properties>
    </profile>
  </profiles>
</settings>
```   

## Installing maven

If you haven't, you need to install maven. Maven is a build and dependency management system.  

```
brew install maven
```

Even though the system is commonly known as maven, the binary is `mvn`.

## Setting up a GPG key
As part of the maven artifact signing process, you need a gpg key set up locally. If you have not done this, run the following command

```
gpg --gen-key
```

Fill out the prompts and you'll have a new gpg key generated locally. You can confirm this by running `gpg --list-keys`. Your new key should appear at the bottom.

You may see something like this.

```
pub   rsa2048 2018-05-01 [SC] [expires: 2020-04-30]
      464ADCDE06A6F2D4BCCBCD601B8EB73128C3987A
uid           [ultimate] First Last <flast@plaid.com>
sub   rsa2048 2018-05-01 [E] [expires: 2020-04-30]
```

In the above example, `464ADCDE06A6F2D4BCCBCD610B8EB73128C3987A` is the identifier for the key. 

Later on in the process, your public key will be verified against one of several online key repos. To upload yours, run this

`gpg --send-keys <key identifier from above>`.

## Publishing the new version
`cd` to `plaid-java` and run the following.

```bash
PLAID_PUBLIC_KEY=insertpublickeyhere \ 
PLAID_SECRET=insertsecrethere \
PLAID_CLIENT_ID=insertclientidhere \ 
mvn release:prepare

PLAID_PUBLIC_KEY=insertpublickey\ 
PLAID_SECRET=insertsecrethere \
PLAID_CLIENT_ID=insertclientidhere \ 
mvn release:perform
```  

This will release a new artifact with a bumped patch version to the Sonatype staging maven repository. After it's pushed to staging, you need to do some mucking around in the UI to push it to production.

## Releasing the artifiact

Login [here](https://oss.sonatype.org/#welcome) using your credentials from [above](#setting-up-your-sonatype-account). Try searching for "com.plaid" in the search bar and see if the newest version is in the "release" repository. If it is, the release is out! It may take a couple of hours to propagate to other Maven repositories, so just hang out and check on the Central Maven Repository in a few hours.

If you don't see the newest version, continue below.

Click on "Staging Repositories" under "Build Promotion". On the top right corner there is a search bar. Search for "com.plaid". 

This process goes:
1. Artifact goes into a staging repo
1. The staging repo is "closed"
1. The staging repo is "released" (to the central repository)

Once you click on the staging repo, you'll be able to "Close" it. Closing it does some checks, verifies some things, but once it finishes successfully (it may take a few minutes), you can then "Release" it. Once it's Released, the artifact is successfully released as a new version. It'll show up under "Artifact Search" within Sonatype "Nexus Repository Manager" right away. It may take a couple of hours to propagate to other Maven repositories.

## Updating the documentation (don't forget these steps).

1. Update README.md with the latest version.
1. Update CHANGELOG.md.
