.class final Lw3/n1;
.super Lw3/c1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lw3/c1<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final r:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
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

    new-instance v0, Lw3/n1;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lw3/n1;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lw3/n1;->r:Lw3/c1;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lw3/c1;-><init>()V

    iput-object p1, p0, Lw3/n1;->p:[Ljava/lang/Object;

    iput p2, p0, Lw3/n1;->q:I

    return-void
.end method


# virtual methods
.method final c([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lw3/n1;->p:[Ljava/lang/Object;

    iget v1, p0, Lw3/n1;->q:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lw3/n1;->q:I

    add-int/2addr p2, p1

    return p2
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lw3/n1;->q:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lw3/n1;->q:I

    const-string v1, "index"

    .line 1
    invoke-static {p1, v0, v1}, Lw3/p;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lw3/n1;->p:[Ljava/lang/Object;

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

.method final l()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw3/n1;->p:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lw3/n1;->q:I

    return v0
.end method
