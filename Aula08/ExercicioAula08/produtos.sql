drop database produtos;
CREATE DATABASE produtos
CHARACTER SET utf8
COLLATE utf8_unicode_ci;

use produtos;

CREATE TABLE produtos(
	id int primary key auto_increment,
    nome varchar(80),
    descricao text,
    qtde_estoque int,
    valor float,
    fabricante varchar(50) 
);

select * from produtos;

insert into produtos(nome,descricao,qtde_estoque,valor,fabricante)
values(
"POMADA PARA CABELO ULTRA HOLD HAIR POMADE BABOON - 80G",
"A Pomada Modeladora Ultra Hold Hair Pomade da Baboon é uma poderosa aliada quando se trata de cortes clássicos. Pois ela possui um alto poder de fixação que te possibilita fazer qualquer tipo de penteado, do mais básico ao profissional. Isso tudo sem precisar de usar uma quantidade exorbitante de produto, é que a pomada para cabelo Ultra Hold da Baboon é super concentrada e rende bastante, bastando apenas uma pequena quantidade para fazer um penteado incrível e com um efeito molhado/brilho como se tivesse acabado de sair do banho",
175,51.12,"BABOON"
);

insert into produtos(nome,descricao,qtde_estoque,valor,fabricante)
values(
"KIT MACHO LÂNDIA SHAMPOO + BÁLSAMO FÓRMUULA 92 PARA CABELOS E BARBA GRISALHOS",
"Um shampoo desenvolvido especialmente para o homem! Garantindo uma poderosa hidratação e fortificação para a barba, cabelo e bigode. Possui pigmentos naturais que revitalizam os fios, voltando assim a cor e brilho de um pelo saudável. É um poderoso antisséptico, eliminando as bactérias e fungos existentes no couro cabeludo sem agredir os fios, deixando-os sem oleosidade, limpos e cheirosos.",
1313,120,"MACHO LÂNDIA"
);
insert into produtos(nome,descricao,qtde_estoque,valor,fabricante)
values(
"Nutrifier Mascara, 500 G, L'Oreal Professionnel",
"Máscara nutritiva sem silicone Nutrifier de L'Oréal Professionnel para cabelos secos e desnutridos. Uma nova fórmula profissional com glicerina. Nutrido, o cabelo fica mais suave, mais flexível e fácil de desembaraçar.",
187,
162.73,
"L'OREAL PROFESSIONNEL"
);

insert into produtos(nome,descricao,qtde_estoque,valor,fabricante)
values(
"Absolut Repair Cortex Lipidium Shampoo, 500 ml, L'Oreal Professionnel",
"L'Oréal Professionnel Absolut Repair Cortex Lipidium Shampoo para cabelos danificados ou quimicamente tratados. Reconstrói instantaneamente todas as camadas dos cabelos, mantendo os nutrientes essenciais no interior dos fios, protegendo contra novas agressões. Os cabelos ficam mais fortes e brilhantes. Fórmula sem sal.",
714,
105.90,
"L'OREAL PROFESSIONNEL"
);
insert into produtos(nome,descricao,qtde_estoque,valor,fabricante)
values(
"Máscara Hidratante Pérolas de Caviar, 1 kg, Widi Care, Preto, Grande",
"Tratamento hidratante formulado para devolver a umidade natural dos fios extremamente ressecados e danificados; proporciona revitalização, maleabilidade, brilho e força; fórmula equilibrada com combinação exclusiva de óleo de argan e extrato de caviar, que aderem rapidamente e efetivamente aos cabelos, assegurando máxima proteção e reconstrução da cutícula ao córtex",
17,
66.90,
"Widi Care"
);
insert into produtos(nome,descricao,qtde_estoque,valor,fabricante)
values(
"Escova de Barba, Enox, Madeira, Enox, Madeira",
"Escova de barba em madeira com cerdas naturais reforçadas com filamentos de nylon, para todos os tipos de cabelo.",
95,
22.38,
"Enox"
);
insert into produtos(nome,descricao,qtde_estoque,valor,fabricante)
values(
"Classik - Kit Pente de Madeira p/Barba Curta",
"Criamos um Kit de pentes de madeira especialmente para você que possui uma barba curta ou média. Disponibilizamos diversos pentes e uma base expositora para decorar seu ambiente.Acompanha:Pente de Madeira Duplo; Pente de Madeira de Bolso M; Pente de Madeira de Bolso com Cabo; Pente Chaveiro P;Base expositora de pentes;",
33,
33.77,
"Classik"
);
select * from produtos;






