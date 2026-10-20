<?php
function decodeHamming74(string $word): array
{
    // Порядок битов: r1 r2 i1 r3 i2 i3 i4 (позиции 1..7)
    $b = array_map('intval', str_split($word));
    $s1 = $b[0] ^ $b[2] ^ $b[4] ^ $b[6]; // позиции 1,3,5,7
    $s2 = $b[1] ^ $b[2] ^ $b[5] ^ $b[6]; // позиции 2,3,6,7
    $s3 = $b[3] ^ $b[4] ^ $b[5] ^ $b[6]; // позиции 4,5,6,7
    $err = $s1 + 2 * $s2 + 4 * $s3; // синдром = номер позиции
    if ($err) {
        $b[$err - 1] ^= 1; // инвертируем ошибочный бит
    }
    $info = $b[2] . $b[4] . $b[5] . $b[6];
    return [$err, $info];
}
 
echo "Введите 7 бит: ";
$word = trim(fgets(STDIN));
if (!preg_match('/^[01]{7}$/', $word)) {
    echo "Нужно ввести ровно 7 символов 0 и 1\n";
    exit(1);
}
[$err, $info] = decodeHamming74($word);
echo $err ? "Ошибка в бите номер $err\n" : "Ошибок нет\n";
echo "Информационные биты: $info\n";

