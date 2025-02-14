import Server.Dados
import Users.Candidato
import Users.Empresa
import Terminal.UITerminal
// empresas
new Empresa(
        "Tech Solutions",
        "contato@techsolutions.com",
        "12.345.678/0001-99",
        "Brasil",
        "São Paulo",
        "01000-000",
        "Empresa especializada em desenvolvimento de software e automação.",
        ["Desenvolvimento de Software", "Automação", "Inteligência Artificial"]
)

new Empresa(
        "InovaTech",
        "suporte@inovatech.com",
        "98.765.432/0001-88",
        "Brasil",
        "Rio de Janeiro",
        "22000-000",
        "Líder em soluções inovadoras para Internet das Coisas (IoT).",
        ["IoT", "Big Data", "Cloud Computing"]
)

new Empresa(
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

new Candidato(
        "Lucas Martins",
        "lucas.martins@email.com",
        "123.456.789-00",
        27,
        "São Paulo",
        "01000-000",
        "Desenvolvedor full-stack apaixonado por automação e inteligência artificial.",
        ["Desenvolvimento de Software", "Automação", "Inteligência Artificial", "Java", "Python"]
) // Alinhado com a empresa Tech Solutions

new Candidato(
        "Ana Pereira",
        "ana.pereira@email.com",
        "987.654.321-11",
        30,
        "Rio de Janeiro",
        "22000-000",
        "Engenheira de software especializada em IoT e computação em nuvem.",
        ["IoT", "Big Data", "Cloud Computing", "Python", "C++"]
) // Alinhada com a empresa InovaTech

new Candidato(
        "Roberto Lima",
        "roberto.lima@email.com",
        "456.789.123-22",
        26,
        "Curitiba",
        "80000-000",
        "Engenheiro ambiental com experiência em tecnologias sustentáveis.",
        ["Energias Renováveis", "Sustentabilidade", "Agricultura Inteligente", "Data Science"]
) // Alinhado com a empresa Green Future

UITerminal.exibirMenu()


