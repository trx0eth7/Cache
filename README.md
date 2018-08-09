# Cashe

## Постановка задачи
- Написать кэш, с которым можно было бы работать одновременно из нескольких потоков. 
Также кэш должен обеспечивать прозрачный доступ к данным. Говоря другими словами, пользователь обращается за данными к кэшу, 
при этом если запись есть в кэше она возвращается из кэша, если нет то запрашивается из источника.
 Функции доступа к записям в источнике и функция инвалидации должны задаваться на этапе создания кэша. 
 При реализации использовать JavaSE (без внешних библиотек). При реализации кэша не использовать thread-safe коллекции.
