.class public Lz6/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/roblox/client/components/k$a<",
        "Lz6/a$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/roblox/client/components/k;
    .locals 0

    check-cast p1, Lz6/a$a;

    invoke-virtual {p0, p1}, Lz6/a$b;->b(Lz6/a$a;)Lcom/roblox/client/components/k;

    move-result-object p1

    return-object p1
.end method

.method public b(Lz6/a$a;)Lcom/roblox/client/components/k;
    .locals 1

    new-instance v0, Lz6/a;

    invoke-direct {v0, p1}, Lz6/a;-><init>(Lz6/a$a;)V

    return-object v0
.end method
