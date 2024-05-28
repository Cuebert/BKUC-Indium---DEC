.class final Lv3/j;
.super Lv3/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lv3/h<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final r:Lv3/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/h<",
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

    new-instance v0, Lv3/j;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lv3/j;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lv3/j;->r:Lv3/h;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lv3/h;-><init>()V

    iput-object p1, p0, Lv3/j;->p:[Ljava/lang/Object;

    iput p2, p0, Lv3/j;->q:I

    return-void
.end method


# virtual methods
.method final c([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lv3/j;->p:[Ljava/lang/Object;

    iget v0, p0, Lv3/j;->q:I

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lv3/j;->q:I

    return p1
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lv3/j;->q:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lv3/j;->q:I

    const-string v1, "index"

    .line 1
    invoke-static {p1, v0, v1}, Lv3/l0;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lv3/j;->p:[Ljava/lang/Object;

    .line 2
    aget-object p1, v0, p1

    return-object p1
.end method

.method final i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final k()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv3/j;->p:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lv3/j;->q:I

    return v0
.end method
