.class final Ly3/x7;
.super Ly3/h6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ly3/h6<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final p:Ly3/z7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly3/z7<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ly3/z7;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/z7<",
            "TE;>;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Ly3/h6;-><init>(II)V

    iput-object p1, p0, Ly3/x7;->p:Ly3/z7;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Ly3/x7;->p:Ly3/z7;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
