<h1>📂 RH API – Gerenciamento de Funcionários</h1>
<p>API REST desenvolvida com Spring Boot para cadastro e gerenciamento de funcionários, incluindo nome, e-mail, salário, data de admissão e status (ativo/inativo).</p>

<hr>

<h2>🔧 Tecnologias</h2>
<ul>
  <li>Java 17+</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Hibernate</li>
  <li>H2 Database (ou outro configurado)</li>
  <li>Jakarta Validation</li>
</ul>

<hr>

<h2>🏁 Como executar</h2>
<pre><code>git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
./mvnw spring-boot:run
</code></pre>

<hr>

<h2>📦 Estrutura do Projeto</h2>
<ul>
  <li><b>controller</b>: camadas de controle da API (<code>FuncionarioController</code>)</li>
  <li><b>service</b>: regras de negócio (<code>FuncionarioService</code>)</li>
  <li><b>dto</b>: objetos de entrada/saída da API</li>
  <li><b>model</b>: entidade <code>Funcionario</code> e enum <code>StatusFuncionario</code></li>
  <li><b>mapper</b>: conversão entre DTO e entidade</li>
  <li><b>repository</b>: interface JPA para acesso ao banco de dados</li>
</ul>

<hr>

<h2>🚀 Endpoints</h2>

<h3>🔹 GET /funcionarios</h3>
<p>Retorna a lista de todos os funcionários cadastrados.</p>
<pre><code>[
  {
    "id": 1,
    "nome": "João Silva",
    "email": "joao@email.com",
    "salario": 3000.00,
    "dataAdmissao": "2024-01-10",
    "status": "ATIVO"
  }
]
</code></pre>

<h3>🔹 GET /funcionarios/{id}</h3>
<p>Busca um funcionário pelo ID.</p>
<b>Resposta (200 OK):</b>
<pre><code>{
  "id": 1,
  "nome": "João Silva",
  "email": "joao@email.com",
  "salario": 3000.00,
  "dataAdmissao": "2024-01-10",
  "status": "ATIVO"
}
</code></pre>

<b>Resposta (404 Not Found):</b>
<p>Sem corpo de resposta.</p>

<h3>🔹 POST /funcionarios</h3>
<p>Cadastra um novo funcionário.</p>
<b>Corpo da Requisição:</b>
<pre><code>{
  "nome": "Maria Oliveira",
  "email": "maria@email.com",
  "salario": 4500.00,
  "dataAdmissao": "2024-02-01",
  "status": "ATIVO"
}
</code></pre>

<b>Resposta (201 Created):</b>
<pre><code>{
  "id": 2,
  "nome": "Maria Oliveira",
  "email": "maria@email.com",
  "salario": 4500.00,
  "dataAdmissao": "2024-02-01",
  "status": "ATIVO"
}
</code></pre>

<h3>🔹 PUT /funcionarios/{id}</h3>
<p>Atualiza um funcionário existente.</p>
<b>Corpo da Requisição:</b>
<pre><code>{
  "nome": "Maria Oliveira",
  "email": "maria.oliveira@email.com",
  "salario": 5000.00,
  "dataAdmissao": "2024-02-01",
  "status": "ATIVO"
}
</code></pre>

<b>Resposta (200 OK):</b> Funcionário atualizado com sucesso. <br>
<b>Resposta (404 Not Found):</b> Funcionário não encontrado.


<h2>📌 Validações</h2>
<ul>
  <li><code>nome</code>: obrigatório</li>
  <li><code>email</code>: obrigatório e formato válido</li>
  <li><code>salario</code>: mínimo de R$ 1.000,00</li>
  <li><code>dataAdmissao</code>: obrigatória</li>
  <li><code>status</code>: obrigatório (ATIVO ou INATIVO)</li>
</ul>

<hr>

<p>A API estará disponível em: <a href="http://localhost:8080/funcionarios">http://localhost:8080/funcionarios</a></p>
