package graph;

public class Map {
        private City portoUniao;
        private City pauloFrontin;
        private City canoinhas;
        private City irati;
        private City palmeira;
        private City campoLargo;
        private City curitiba;
        private City balsaNova;
        private City araucaria;
        private City saoJose;
        private City contenda;
        private City mafra;
        private City tijucas;
        private City lapa;
        private City saoMateus;
        private City tresBarras;

        public Map() {
            portoUniao = new City("Porto União", 203);
            pauloFrontin = new City("Paulo Frontin", 172);
            canoinhas = new City("Canoinhas", 141);
            irati = new City("Irati", 139);
            palmeira = new City("Palmeira", 59);
            campoLargo = new City("Campo Largo", 27);
            curitiba = new City("Curitiba", 0);
            balsaNova = new City("Balsa Nova", 41);
            araucaria = new City("Araucária", 23);
            saoJose = new City("São José dos Pinhais", 13);
            contenda = new City("Contenda", 39);
            mafra = new City("Mafra", 94);
            tijucas = new City("Tijucas do Sul", 56);
            lapa = new City("Lapa", 74);
            saoMateus = new City("São Mateus do Sul", 123);
            tresBarras = new City("Três Barras", 131);

            portoUniao.addAdjacent(new AdjacentCity(pauloFrontin, 46));
            portoUniao.addAdjacent(new AdjacentCity(canoinhas, 78));
            portoUniao.addAdjacent(new AdjacentCity(saoMateus, 87));

            pauloFrontin.addAdjacent(new AdjacentCity(portoUniao, 46));
            pauloFrontin.addAdjacent(new AdjacentCity(irati, 75));

            canoinhas.addAdjacent(new AdjacentCity(portoUniao, 78));
            canoinhas.addAdjacent(new AdjacentCity(tresBarras, 12));
            canoinhas.addAdjacent(new AdjacentCity(mafra, 66));

            irati.addAdjacent(new AdjacentCity(pauloFrontin, 75));
            irati.addAdjacent(new AdjacentCity(palmeira, 75));
            irati.addAdjacent(new AdjacentCity(saoMateus, 57));

            palmeira.addAdjacent(new AdjacentCity(irati, 75));
            palmeira.addAdjacent(new AdjacentCity(saoMateus, 77));
            palmeira.addAdjacent(new AdjacentCity(campoLargo, 55));

            campoLargo.addAdjacent(new AdjacentCity(palmeira, 55));
            campoLargo.addAdjacent(new AdjacentCity(balsaNova, 22));
            campoLargo.addAdjacent(new AdjacentCity(curitiba,29));

            curitiba.addAdjacent(new AdjacentCity(campoLargo, 29));
            curitiba.addAdjacent(new AdjacentCity(balsaNova, 51));
            curitiba.addAdjacent(new AdjacentCity(araucaria, 37));
            curitiba.addAdjacent(new AdjacentCity(saoJose, 15));

            balsaNova.addAdjacent(new AdjacentCity(curitiba, 51));
            balsaNova.addAdjacent(new AdjacentCity(campoLargo, 22));
            balsaNova.addAdjacent(new AdjacentCity(contenda, 19));

            araucaria.addAdjacent(new AdjacentCity(curitiba, 37));
            araucaria.addAdjacent(new AdjacentCity(contenda, 18));

            saoJose.addAdjacent(new AdjacentCity(curitiba, 15));
            saoJose.addAdjacent(new AdjacentCity(tijucas, 49));

            contenda.addAdjacent(new AdjacentCity(balsaNova, 19));
            contenda.addAdjacent(new AdjacentCity(araucaria,18));
            contenda.addAdjacent(new AdjacentCity(lapa, 26));

            mafra.addAdjacent(new AdjacentCity(tijucas, 99));
            mafra.addAdjacent(new AdjacentCity(lapa, 57));
            mafra.addAdjacent(new AdjacentCity(canoinhas, 66));

            tijucas.addAdjacent(new AdjacentCity(mafra, 99));
            tijucas.addAdjacent(new AdjacentCity(saoJose, 49));

            lapa.addAdjacent(new AdjacentCity(contenda, 26));
            lapa.addAdjacent(new AdjacentCity(saoMateus, 60));
            lapa.addAdjacent(new AdjacentCity(mafra, 57));

            saoMateus.addAdjacent(new AdjacentCity(palmeira, 77));
            saoMateus.addAdjacent(new AdjacentCity(irati, 57));
            saoMateus.addAdjacent(new AdjacentCity(lapa,60));
            saoMateus.addAdjacent(new AdjacentCity(tresBarras, 43));
            saoMateus.addAdjacent(new AdjacentCity(portoUniao, 87));

            tresBarras.addAdjacent(new AdjacentCity(saoMateus, 43));
            tresBarras.addAdjacent(new AdjacentCity(canoinhas, 12));
        }

        public City getPortoUniao() {
            return portoUniao;
        }

        public void setPortoUniao(City portoUniao) {
            this.portoUniao = portoUniao;
        }

        public City getPauloFrontin() {
            return pauloFrontin;
        }

        public void setPauloFrontin(City pauloFrontin) {
            this.pauloFrontin = pauloFrontin;
        }

        public City getCanoinhas() {
            return canoinhas;
        }

        public void setCanoinhas(City canoinhas) {
            this.canoinhas = canoinhas;
        }

        public City getIrati() {
            return irati;
        }

        public void setIrati(City irati) {
            this.irati = irati;
        }

        public City getPalmeira() {
            return palmeira;
        }

        public void setPalmeira(City palmeira) {
            this.palmeira = palmeira;
        }

        public City getCampoLargo() {
            return campoLargo;
        }

        public void setCampoLargo(City campoLargo) {
            this.campoLargo = campoLargo;
        }

        public City getCuritiba() {
            return curitiba;
        }

        public void setCuritiba(City curitiba) {
            this.curitiba = curitiba;
        }

        public City getBalsaNova() {
            return balsaNova;
        }

        public void setBalsaNova(City balsaNova) {
            this.balsaNova = balsaNova;
        }

        public City getAraucaria() {
            return araucaria;
        }

        public void setAraucaria(City araucaria) {
            this.araucaria = araucaria;
        }

        public City getSaoJose() {
            return saoJose;
        }

        public void setSaoJose(City saoJose) {
            this.saoJose = saoJose;
        }

        public City getContenda() {
            return contenda;
        }

        public void setContenda(City contenda) {
            this.contenda = contenda;
        }

        public City getMafra() {
            return mafra;
        }

        public void setMafra(City mafra) {
            this.mafra = mafra;
        }

        public City getTijucas() {
            return tijucas;
        }

        public void setTijucas(City tijucas) {
            this.tijucas = tijucas;
        }

        public City getLapa() {
            return lapa;
        }

        public void setLapa(City lapa) {
            this.lapa = lapa;
        }

        public City getSaoMateus() {
            return saoMateus;
        }

        public void setSaoMateus(City saoMateus) {
            this.saoMateus = saoMateus;
        }

        public City getTresBarras() {
            return tresBarras;
        }

        public void setTresBarras(City tresBarras) {
            this.tresBarras = tresBarras;
        }

}
