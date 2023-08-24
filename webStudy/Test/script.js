const slides = document.querySelectorAll('.slide');
let currentSlide = 0;

function showSlide() {
  slides.forEach((slide, index) => {
    if (index === currentSlide) {
      slide.classList.add('active');
    } else {
      slide.classList.remove('active');
    }
  });
}

function nextSlide() {
  currentSlide = (currentSlide + 1) % slides.length;
  showSlide();
}

slides.forEach((slide, index) => {
  slide.addEventListener('click', () => {
    currentSlide = index;
    showSlide();

    if (currentSlide === 0 || currentSlide === 1 || currentSlide === 2) {
      window.open('https://www.youtube.com/watch?v=CifbrpR9U70', '_blank', 'noopener');
    }
  });
});

setInterval(nextSlide, 3000); // 3초마다 슬라이드 변경
