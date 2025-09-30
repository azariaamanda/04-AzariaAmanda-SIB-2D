<?php
$loremIpsum = "Lorem ipsum dolor sit amet consectetur adipisicing elit.
    Magni deleniti ut nisi, officia necessitatibus eum a eos cupiditate
    inventore non at facere nulla autem ipsa corrupti exercitationem eaque corporis.
    Consequat velit consectetur anim enim consectetur ad. Sint deserunt velit sunt
    voluptate sint elit aliquid Lorem dolor amet ut exercitation in commodo.
    Cillum nulla velit aliquid ut nostrud.";

echo "<p>{$loremIpsum}</p>";
echo "Panjang karakter: " . strlen($loremIpsum) . "<br>";
echo "Panjang kata: " . str_word_count($loremIpsum) . "<br>";
echo "<p>" . strtoupper($loremIpsum) . "<p>";
echo "<p>" . strtolower($loremIpsum) . "<p>";
?>
