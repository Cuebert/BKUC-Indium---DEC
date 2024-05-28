.class Lcom/roblox/client/landing/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private n:I

.field private o:I

.field private p:I


# direct methods
.method constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/roblox/client/landing/a;->n:I

    .line 3
    iput p2, p0, Lcom/roblox/client/landing/a;->o:I

    .line 4
    iput p3, p0, Lcom/roblox/client/landing/a;->p:I

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/roblox/client/landing/a;->o:I

    return v0
.end method

.method b()I
    .locals 1

    iget v0, p0, Lcom/roblox/client/landing/a;->p:I

    return v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lcom/roblox/client/landing/a;->n:I

    return v0
.end method
