import Server.Dados
import Server.Vaga
import Users.Candidato
import Users.Empresa

// empresas
Empresa empresa1 = new Empresa(
        "Tech Solutions",
        "contato@techsolutions.com",
        "12.345.678/0001-99",
        "Brasil",
        "São Paulo",
        "01000-000",
        "Empresa especializada em desenvolvimento de software e automação.",
        ["Desenvolvimento de Software", "Automação", "Inteligência Artificial"]
)

Empresa empresa2 = new Empresa(
        "InovaTech",
        "suporte@inovatech.com",
        "98.765.432/0001-88",
        "Brasil",
        "Rio de Janeiro",
        "22000-000",
        "Líder em soluções inovadoras para Internet das Coisas (IoT).",
        ["IoT", "Big Data", "Cloud Computing"]
)

Empresa empresa3 = new Empresa(
        "Green Future",
        "contato@greenfuture.com",
        "55.444.333/0001-77",
        "Brasil",
        "Curitiba",
        "80000-000",
        "Soluções sustentáveis para um futuro melhor.",
        ["Energias Renováveis", "Sustentabilidade", "Agricultura Inteligente"]
)

new Empresa(
        "CyberShield",
        "seguranca@cybershield.com",
        "22.333.444/0001-66",
        "Brasil",
        "Brasília",
        "70000-000",
        "Especialista em segurança cibernética e proteção de dados.",
        ["Cyber Security", "Pentest", "Proteção de Dados"]
)

new Empresa(
        "NextGen Robotics",
        "info@nextgenrobotics.com",
        "11.222.333/0001-55",
        "Brasil",
        "Belo Horizonte",
        "30000-000",
        "Empresa focada em desenvolvimento de robôs autônomos.",
        ["Robótica", "Machine Learning", "Automação Industrial"]
)
//candidatos

Candidato candidato1 = new Candidato(
        "Lucas Martins",
        "lucas.martins@email.com",
        "123.456.789-00",
        27,
        "São Paulo",
        "01000-000",
        "Desenvolvedor full-stack apaixonado por automação e inteligência artificial.",
        ["Desenvolvimento de Software", "Automação", "Inteligência Artificial", "Java", "Python"]
) // Alinhado com a empresa Tech Solutions

Candidato candidato2 = new Candidato(
        "Ana Pereira",
        "ana.pereira@email.com",
        "987.654.321-11",
        30,
        "Rio de Janeiro",
        "22000-000",
        "Engenheira de software especializada em IoT e computação em nuvem.",
        ["IoT", "Big Data", "Cloud Computing", "Python", "C++"]
) // Alinhada com a empresa InovaTech

Candidato candidato3 = new Candidato(
        "Roberto Lima",
        "roberto.lima@email.com",
        "456.789.123-22",
        26,
        "Curitiba",
        "80000-000",
        "Engenheiro ambiental com experiência em tecnologias sustentáveis.",
        ["Energias Renováveis", "Sustentabilidade", "Agricultura Inteligente", "Data Science"]
) // Alinhado com a empresa Green Future


Vaga vaga1 = empresa1.criarVaga("Desenvolvedor Full-Stack")
Vaga vaga2 = empresa2.criarVaga("Engenheiro de Software IoT")
Vaga vaga3 = empresa3.criarVaga("Engenheiro Ambiental Sustentável")

candidato1.curtirVaga(vaga1)  // Lucas curte a vaga de Desenvolvedor Full-Stack
candidato2.curtirVaga(vaga2)  // Ana curte a vaga de Engenheiro de Software IoT
candidato3.curtirVaga(vaga3)  // Roberto curte a vaga de Engenheiro Ambiental Sustentável

empresa1.curtirCandidato(candidato1, vaga1)  // Tech Solutions curte Lucas para a vaga
empresa2.curtirCandidato(candidato2, vaga2)  // InovaTech curte Ana para a vaga
empresa3.curtirCandidato(candidato3, vaga3)  // Green Future curte Roberto para a vaga

Dados.verificarMatches(empresa1, candidato1)  // Espera-se um match entre Lucas e Tech Solutions
Dados.verificarMatches(empresa2, candidato2)  // Espera-se um match entre Ana e InovaTech
Dados.verificarMatches(empresa3, candidato3)  // Espera-se um match entre Roberto e Green Future
