.class Lf5/c$b;
.super Lf5/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf5/c<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final transient p:I

.field final transient q:I

.field final synthetic r:Lf5/c;


# direct methods
.method constructor <init>(Lf5/c;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf5/c$b;->r:Lf5/c;

    invoke-direct {p0}, Lf5/c;-><init>()V

    .line 2
    iput p2, p0, Lf5/c$b;->p:I

    .line 3
    iput p3, p0, Lf5/c$b;->q:I

    return-void
.end method


# virtual methods
.method e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf5/c$b;->r:Lf5/c;

    invoke-virtual {v0}, Lf5/b;->e()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lf5/c$b;->q:I

    invoke-static {p1, v0}, Le5/g;->d(II)I

    .line 2
    iget-object v0, p0, Lf5/c$b;->r:Lf5/c;

    iget v1, p0, Lf5/c$b;->p:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i()I
    .locals 2

    iget-object v0, p0, Lf5/c$b;->r:Lf5/c;

    invoke-virtual {v0}, Lf5/b;->k()I

    move-result v0

    iget v1, p0, Lf5/c$b;->p:I

    add-int/2addr v0, v1

    iget v1, p0, Lf5/c$b;->q:I

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lf5/c;->l()Lf5/j;

    move-result-object v0

    return-object v0
.end method

.method k()I
    .locals 2

    iget-object v0, p0, Lf5/c$b;->r:Lf5/c;

    invoke-virtual {v0}, Lf5/b;->k()I

    move-result v0

    iget v1, p0, Lf5/c$b;->p:I

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-super {p0}, Lf5/c;->r()Lf5/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lf5/c;->s(I)Lf5/k;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lf5/c$b;->q:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lf5/c$b;->v(II)Lf5/c;

    move-result-object p1

    return-object p1
.end method

.method public v(II)Lf5/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lf5/c<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lf5/c$b;->q:I

    invoke-static {p1, p2, v0}, Le5/g;->j(III)V

    .line 2
    iget-object v0, p0, Lf5/c$b;->r:Lf5/c;

    iget v1, p0, Lf5/c$b;->p:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lf5/c;->v(II)Lf5/c;

    move-result-object p1

    return-object p1
.end method
