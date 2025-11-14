document.addEventListener("DOMContentLoaded", () => {
    console.log("Script.js berhasil dibaca!");

    const searchInput = document.getElementById("searchBeasiswa") || document.getElementById("searchKampus");
    if (!searchInput) return;

    searchInput.addEventListener("keyup", function () {
        const keyword = this.value.toLowerCase();

        const cards = document.querySelectorAll(
        ".scholarship-card, .card, .university-card"
        );

        cards.forEach(card => {
        const text = card.textContent.toLowerCase();

        if (text.includes(keyword)) {
            card.style.display = "block";
        } else {
            card.style.display = "none";
        }
        });
    });
});
