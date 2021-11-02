INSERT INTO public.pessoa(
    id_pessoa, cpf, data_nascimento, nome)
VALUES ('001','18458195', '1956-10-04', 'Joao');

INSERT INTO public.transacao(
    id_transacao, data_transacao, valor, id_conta)
VALUES ('001', '2020-06-10', '2500', '001');


INSERT INTO public.conta(

    data_criacao, flag_ativo, limite_saque_diario, saldo, tipo_conta)
VALUES ( '20-06-02', 'true', '1000', 2000, 01);
