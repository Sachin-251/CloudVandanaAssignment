tailwind.config = {
    theme: {
        extend: {
            colors: {
                blue: '#00bfff',
                gray: '#696969',
                yellow: "#FDCC49",
                green: "#779556",
                'off-white': '#fff0f5',
            },
            fontFamily: {
                playfair: ["Playfair Display", "serif"],
                opensans: ["Open Sans", "sans-serif"],
                josefin: ["Josefin Sans", "sans-serif"],
                merryweather: ["Merryweather", "serif"],
                plex: ["IBM Plex Sans", "roboto"],
            },
        },
        screens: {
            xxs: "320px",
            xs: "480px",
            sm: "768px",
            md: "1060px",
        },
    }
}