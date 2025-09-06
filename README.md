📚 Resumo: Trabalhando com JDBC e Conexão ao Banco de Dados
🔌 Obtendo uma conexão
A conexão é representada pela interface java.sql.Connection.

O método DriverManager.getConnection(url, usuario, senha) é usado para abrir a conexão.

A URL define o caminho do banco, exemplo para MySQL:

Código
jdbc:mysql://localhost:3306/meu_banco
jdbc: protocolo

mysql: subprotocolo

localhost: servidor

3306: porta

meu_banco: nome do banco

⚠️ Tratamento de exceções
O método getConnection() pode lançar SQLException, indicando problemas como:

Driver não encontrado

Erros de autenticação

Problemas na expressão SQL

🛠️ Principais métodos da interface Connection
Método	Função
close()	Fecha a conexão
commit()	Confirma alterações (se auto-commit estiver desativado)
rollback()	Desfaz alterações desde o último commit
setAutoCommit(boolean)	Ativa/desativa auto-commit
createStatement()	Cria um Statement para executar SQL simples
prepareStatement(sql)	Cria um PreparedStatement para SQL com parâmetros
prepareCall(sql)	Cria um CallableStatement para stored procedures
getMetaData()	Retorna metadados do banco (estrutura, tabelas, tipos, etc.)
isClosed()	Verifica se a conexão está fechada
isReadOnly()	Verifica se a conexão é somente leitura
🔍 Executando consultas
Use Statement stmt = conexao.createStatement();

Para SELECTs:

java
ResultSet resultado = stmt.executeQuery("SELECT * FROM clientes");
Para INSERT, UPDATE, DELETE: Use executeUpdate()

Para queries que retornam múltiplos resultados (ex: stored procedures): Use execute()
