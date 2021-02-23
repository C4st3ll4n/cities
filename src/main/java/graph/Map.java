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
            portoUniao = new City("Porto União");
            pauloFrontin = new City("Paulo Frontin");
            canoinhas = new City("Canoinhas");
            irati = new City("Irati");
            palmeira = new City("Palmeira");
            campoLargo = new City("Campo Largo");
            curitiba = new City("Curitiba");
            balsaNova = new City("Balsa Nova");
            araucaria = new City("Araucária");
            saoJose = new City("São José dos Pinhais");
            contenda = new City("Contenda");
            mafra = new City("Mafra");
            tijucas = new City("Tijucas do Sul");
            lapa = new City("Lapa");
            saoMateus = new City("São Mateus do Sul");
            tresBarras = new City("Três Barras");

            portoUniao.addAdjacent(new AdjacentCity(pauloFrontin));
            portoUniao.addAdjacent(new AdjacentCity(canoinhas));
            portoUniao.addAdjacent(new AdjacentCity(saoMateus));

            pauloFrontin.addAdjacent(new AdjacentCity(portoUniao));
            pauloFrontin.addAdjacent(new AdjacentCity(irati));

            canoinhas.addAdjacent(new AdjacentCity(portoUniao));
            canoinhas.addAdjacent(new AdjacentCity(tresBarras));
            canoinhas.addAdjacent(new AdjacentCity(mafra));

            irati.addAdjacent(new AdjacentCity(pauloFrontin));
            irati.addAdjacent(new AdjacentCity(palmeira));
            irati.addAdjacent(new AdjacentCity(saoMateus));

            palmeira.addAdjacent(new AdjacentCity(irati));
            palmeira.addAdjacent(new AdjacentCity(saoMateus));
            palmeira.addAdjacent(new AdjacentCity(campoLargo));

            campoLargo.addAdjacent(new AdjacentCity(palmeira));
            campoLargo.addAdjacent(new AdjacentCity(balsaNova));
            campoLargo.addAdjacent(new AdjacentCity(curitiba));

            curitiba.addAdjacent(new AdjacentCity(campoLargo));
            curitiba.addAdjacent(new AdjacentCity(balsaNova));
            curitiba.addAdjacent(new AdjacentCity(araucaria));
            curitiba.addAdjacent(new AdjacentCity(saoJose));

            balsaNova.addAdjacent(new AdjacentCity(curitiba));
            balsaNova.addAdjacent(new AdjacentCity(campoLargo));
            balsaNova.addAdjacent(new AdjacentCity(contenda));

            araucaria.addAdjacent(new AdjacentCity(curitiba));
            araucaria.addAdjacent(new AdjacentCity(contenda));

            saoJose.addAdjacent(new AdjacentCity(curitiba));
            saoJose.addAdjacent(new AdjacentCity(tijucas));

            contenda.addAdjacent(new AdjacentCity(balsaNova));
            contenda.addAdjacent(new AdjacentCity(araucaria));
            contenda.addAdjacent(new AdjacentCity(lapa));

            mafra.addAdjacent(new AdjacentCity(tijucas));
            mafra.addAdjacent(new AdjacentCity(lapa));
            mafra.addAdjacent(new AdjacentCity(canoinhas));

            tijucas.addAdjacent(new AdjacentCity(mafra));
            tijucas.addAdjacent(new AdjacentCity(saoJose));

            lapa.addAdjacent(new AdjacentCity(contenda));
            lapa.addAdjacent(new AdjacentCity(saoMateus));
            lapa.addAdjacent(new AdjacentCity(mafra));

            saoMateus.addAdjacent(new AdjacentCity(palmeira));
            saoMateus.addAdjacent(new AdjacentCity(irati));
            saoMateus.addAdjacent(new AdjacentCity(lapa));
            saoMateus.addAdjacent(new AdjacentCity(tresBarras));
            saoMateus.addAdjacent(new AdjacentCity(portoUniao));

            tresBarras.addAdjacent(new AdjacentCity(saoMateus));
            tresBarras.addAdjacent(new AdjacentCity(canoinhas));
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
