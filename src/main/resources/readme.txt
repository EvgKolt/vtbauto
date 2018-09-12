Настройка пропертиз при сменах клиента:
1-Клиент по картам(для заказа карты) -
->DBConnect(DELETE_CARD_ORDER ->organization_id)
2-Клиент по картам для остальных операций
card.login, card.password
3-Клиент на 273:
login, password +
(contact_id(tb_contact)->tb_person_contact->tb_organization)
DBConnect(CURRENT_EMAIL) = contact_id = "****";
select * from tb_organization where inn = '7736244337';
select * from tb_person where organization_id = '6852f577-be14-47e8-b7eb-321cffe4d5ec';
select * from tb_person_contact where person_id = 'sso_____853711de-1567-4b12-b329-74869779b9f0';

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
