**Архітектура автоматичної генерації та оплати рахунків (інвойсів)**

Ми зберігаємо користувачів, картки та їх поточний тариф в класі **User**.

1. Для того, щоб розпочати роботу в системі потрібно додати користувача через його API.
2. Далі встановлюємо поточний тариф, період сплати та її тип(автоматична/ручна). В користувача також зберігаються усі його використані картки, щоб він їх не вводив ще раз.

Структура рахунків зберігається в класі **Invoice**, їхньою генерацією займається **InvoiceService**.
1. Потім генеруємо invoice через його API. Від користувача отримуємо його id та номер карти. 
2. InvoiceService генерує новий рахунок згідно з конфігурацією користувача та записує його в базу даних. Якщо карти немає в БД — оновлюємо користувача.

Оплату здійснює клас **PayingService**.
1. Будь-яка спроба оплати відбувається через окремий endpoint /api/invoice/{id}/auto-pay.
2. Якщо рахунок визначений як "ручний", оплата не спрацює і сервіс поверне помилку.
3. Також сервіс перевіряє скільки в користувача несплачених рахунків за певний період і якщо це **суперечить** конфігурації — блокує його.
4. Якщо все гаразд — оновлює стан рахунку в БД та повертає результат про успішну оплату.
