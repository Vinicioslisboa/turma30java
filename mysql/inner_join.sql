-- select * from tb_produtos

select tb_produtos.Nome, tb_produtos.Preço, tb_marcas.nome 
from tb_produtos
	inner join tb_marcas on tb_marcas.Id = tb_produtos.marca_id
where tb_produtos.nome = "Tênis"
or tb_produtos.nome = "Sapato"


-- where tb_marcas.nome Like  %Ni% 
-- and tb_produtos.Preço < 50.00
-- and tb_produtos.Nome = camisa




