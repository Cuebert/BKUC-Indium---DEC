.class final Ly3/a8;
.super Ly3/z7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ly3/z7<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final r:Ly3/z7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly3/z7<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient p:[Ljava/lang/Object;

.field private final transient q:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly3/a8;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Ly3/a8;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Ly3/a8;->r:Ly3/z7;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ly3/z7;-><init>()V

    iput-object p1, p0, Ly3/a8;->p:[Ljava/lang/Object;

    iput p2, p0, Ly3/a8;->q:I

    return-void
.end method


# virtual methods
.method final c([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Ly3/a8;->p:[Ljava/lang/Object;

    iget v0, p0, Ly3/a8;->q:I

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Ly3/a8;->q:I

    return p1
.end method

.method final e()I
    .locals 1

    iget v0, p0, Ly3/a8;->q:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Ly3/a8;->q:I

    const-string v1, "index"

    .line 1
    invoke-static {p1, v0, v1}, Ly3/f4;->a(IILjava/lang/String;)I

    iget-object v0, p0, Ly3/a8;->p:[Ljava/lang/Object;

    .line 2
    aget-object p1, v0, p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method final i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final k()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly3/a8;->p:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Ly3/a8;->q:I

    return v0
.end method
