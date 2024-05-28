.class final Lt3/x;
.super Lt3/s;
.source "SourceFile"


# instance fields
.field private final p:Lt3/a0;


# direct methods
.method constructor <init>(Lt3/a0;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lt3/s;-><init>(II)V

    iput-object p1, p0, Lt3/x;->p:Lt3/a0;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt3/x;->p:Lt3/a0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
