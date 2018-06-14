<p>Este repositorio contém arquivos do projeto de uma loja fictícia, sendo assim a página index.html
conterá apenas um layout para uma futura adptação como postar fotos e detalhes sobre o produto
que será vendido. Um projeto simples mas que atende inicialmente o solicitado de realizar um CRUD de um produto.
Este projeto é um sistem web, foi desenvolvido usando o padrão de projeto MVC, no front-end(view) está sendo utilizado HTML5, CSS3, JavaScript,
Bootstrap e  AngularJS(controller), no Back-end foi utilizado Java, JPA, Hibernate, CDI, Mysql, Wildfly. Para a comunicação
do front-end com o back-end foi utilizado web service para agilizar o trafego dos dados via XML e JSON.</p>

<h2>1-Como faço para baixar o projeto?</h2>
<p>R: Se voçê é novo no gitHub e quer apenas baixar o pacote completo aperte no botão no verde que diz "Clone or download",
escolha a opção download zip e pronto seu download será realizado.</p>

<h2>2-Como executar esse projeto no meu computador?</h2>
<p>R: Este projeto foi desenvolvido na IDE eclipse, após baixar o projeto realize a importação para dentro do eclipse e faça a configuração 
com o banco de dados, crie um banco chamado produto, as configurações para conexão com o banco de dados deve ser setadas no arquivo persistence.xml que fica dentro da pasta Java Resources/src/META-INF/persistence.xml, faça as configurações conforme seu usuário
e senha. Este projeto esta utilizando um datasource que foi configurado manualmente diretamente no arquivo standolone.xml que fica dentro
da pasta do servidor widfly8.2.0. Voçe pode optar por configurar somente no arquivo persitence.xml setando o restante da configuração 
que no seu caso irá precisar especificar qual o tipo de conexão , usuário, senha e driver. Abaixo como eu setei as configurações no arquivo standlone</p>
<ul>
    <li><datasource jndi-name="java:jboss/datasources/Testeweb" pool-name="Testeweb" enabled="true" use-java-context="true"></li>
        <li><connection-url>jdbc:MYSQL://localhost:3306/produto</connection-url></li>
        <li><driver>mysql</driver></li>
        <li><security>
                        <user-name>root</user-name>
                        <password>1234</password>
                    </security></li>
                    <li><security>
                        <user-name>root</user-name>
                        <password>1234</password>
                    </security></li>
                    <li></datasource></li>

                    <li><driver name="mysql" module="com.mysql">
                        <xa-datasource-class>org.mysql.jdbc.Driver</xa-datasource-class>
                    </driver></li>
</ul>
  
               
                    
                    
                

                