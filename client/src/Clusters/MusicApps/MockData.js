import smartWatch from './Images/smartWatch.png';
import iHeartRadioIcon from './Images/iHeartRadioIcon.png';
import pandoraIcon from './Images/pandoraIcon.png';
import spotifyIcon from './Images/spotifyIcon.png';
import navMusicIcon from './Images/navMusicIcon.png';

export const musicApps = {
    title: "Rock out while you work out",
    cards: [
        {
            appId: "01",
            wearOsImage: smartWatch,
            title: "Spotify: Listen to new music...",
            iconUrl: spotifyIcon,
            rating: 4.6,
            rated: "E - Everyone",
            appDescription: "Listen to the songs and podcasts you love and discover new music"
        },
        {            
            appId: "02",
            wearOsImage: smartWatch,
            title: "iHeartRadio: Radio, Podcast...",
            iconUrl: iHeartRadioIcon,
            rating: 4.6,
            rated: "E - Everyone",
            appDescription: "Your music, Your stations, and #1 For Podcasts. All Free."
        },
        {            
            appId: "03",
            wearOsImage: smartWatch,
            title: "NavMusic: Wear OS Offline...",
            iconUrl: navMusicIcon,
            rating: 4.6,
            rated: "E - Everyone",
            appDescription: "Play offline on your wear OS device with a clear, simple interface"
        },
        {           
            appId: "04",
            wearOsImage: smartWatch,
            title: "Pandora: Streaming Music...",
            iconUrl: pandoraIcon,
            rating: 4.6,
            rated: "E - Everyone",
            appDescription: "A personalized listening experience that evolves with your tastes"}
    ]
};
