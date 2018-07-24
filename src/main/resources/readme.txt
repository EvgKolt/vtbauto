Настройка пропертиз при смене клиента:
1-Клиент по картам(для заказа карты) -
card.login1, card.password1 +
(Cards base 241)select * from tb_organization where inn = '***********'->
->DBConnect(DELETE_CARD_ORDER ->organization_id)
2-Клиент по картам для остальных операций
card.login, card.password
3-Клиент на 273:
login, password +
(contact_id(tb_contact)->tb_person_contact->tb_organization)
DBConnect(CURRENT_EMAIL) = contact_id = "****";

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
