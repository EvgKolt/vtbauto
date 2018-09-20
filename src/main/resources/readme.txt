Настройка пропертиз при сменах клиента:
login, password
1 - organization_id(MSBClient class)
select * from tb_organization where inn = '7736244337';
2 - contact_id(MSBClient class)
select * from tb_person where organization_id = '6852f577-be14-47e8-b7eb-321cffe4d5ec';
select * from tb_person_contact where person_id = 'sso_____853711de-1567-4b12-b329-74869779b9f0';
select * from tb_person_contact where person_id = 'sso_____853711de-1567-4b12-b329-74869779b9f0';
select * from tb_contact where contact_id = '4798';




////////////////////
Если сбился логин его можно найти так:

RX_SSO
RX_SSO
логин и пароль
хост rumskapp445
Колтуновский Евгений Александрович [10:58]:
ок,  грасиас
Санжаков Илья Александрович [10:58]:
select * from "Credentials"
where "principalId"='sso_____8c5890a8-7d53-4268-89e9-947ff1a5dbda'
principalId=person_id(from tb_personj msbdb)
\\\\\\\\\\\\\\\\\
4-Тест со сменой ответственного в шуге#223371
inn,kpp
