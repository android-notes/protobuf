### Fastjson

* bytes to obj

|    1  |    2  |    3  |    4  |    5  |    6  |    7  |    8  |    9  |   10  | 平均 |
|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|------|
|  326  |  244  | 316   |   315 | 276   |  265  | 277   |  224  | 233   |   358 |283.4 |

* obj to json bytes

|    1  |    2  |    3  |    4  |    5  |    6  |    7  |    8  |    9  |   10  | 平均 |
|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|------|
|45     | 76    | 44    |    61 | 73    |  48   |  47   |   59  |   63  |    44 |    56|

* size

40759 bytes



### Gson

* bytes to obj

|    1  |    2  |    3  |    4  |    5  |    6  |    7  |    8  |    9  |   10  | 平均 |
|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|------|
|  323  |  312  | 222   |   279 | 299   |  154  | 457   |  285  | 325   |   279 | 293.5|

*  obj to json bytes

|    1  |    2  |    3  |    4  |    5  |    6  |    7  |    8  |    9  |   10  | 平均 |
|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|------|
|108    | 111   | 155   |    46 | 38    |  80   |  262  |  177  |   87  |   120 | 118.4|

* size

41768 bytes



### Google Probo Buf

* bytes to obj

|    1  |    2  |    3  |    4  |    5  |    6  |    7  |    8  |    9  |   10  | 平均 |
|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|------|
|  12   |  32   | 56    |   30  | 48    |  11   | 10    |  16   | 11    |   48  | 27.4 |

* obj -> google proto buf obj -> json bytes

|    1  |    2  |    3  |    4  |    5  |    6  |    7  |    8  |    9  |   10  | 平均 |
|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|------|
|140    | 156   | 114   |   166 | 205   |  82   |  96   |  295  |   169 |   243 | 166.6|

* google proto buf obj -> json bytes

|    1  |    2  |    3  |    4  |    5  |    6  |    7  |    8  |    9  |   10  | 平均  |
|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|------|
|52     | 134   | 43    |   104 | 95    |  63   |  28   |  70   |   31  |   27  | 64.7 |

* size

25107 bytes
