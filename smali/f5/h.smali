.class Lf5/h;
.super Lf5/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lf5/c<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final r:Lf5/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf5/c<",
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

    new-instance v0, Lf5/h;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lf5/h;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lf5/h;->r:Lf5/c;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf5/c;-><init>()V

    .line 2
    iput-object p1, p0, Lf5/h;->p:[Ljava/lang/Object;

    .line 3
    iput p2, p0, Lf5/h;->q:I

    return-void
.end method


# virtual methods
.method c([Ljava/lang/Object;I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lf5/h;->p:[Ljava/lang/Object;

    iget v1, p0, Lf5/h;->q:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2
    iget p1, p0, Lf5/h;->q:I

    add-int/2addr p2, p1

    return p2
.end method

.method e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf5/h;->p:[Ljava/lang/Object;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lf5/h;->q:I

    invoke-static {p1, v0}, Le5/g;->d(II)I

    .line 2
    iget-object v0, p0, Lf5/h;->p:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method i()I
    .locals 1

    iget v0, p0, Lf5/h;->q:I

    return v0
.end method

.method k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lf5/h;->q:I

    return v0
.end method
