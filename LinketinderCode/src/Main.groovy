import Users.Empresa

static void main(String[] args) {
  println "Hello world!"
}

def empresa = new Empresa("Tech Solutions", "contato@techsolutions.com", "12.345.678/0001-90",
        "Brasil", "Amazonas", "69000-000", "Empresa especializada em soluções tecnológicas.",
        ["Desenvolvimento de Software", "Automação", "IA", "Cloud Computing"])

println empresa
