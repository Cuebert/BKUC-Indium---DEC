.class Lcom/roblox/client/app/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/app/a$b;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/app/a$b;


# direct methods
.method constructor <init>(Lcom/roblox/client/app/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/app/a$b$a;->n:Lcom/roblox/client/app/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/app/a$b$a;->n:Lcom/roblox/client/app/a$b;

    iget-object v0, v0, Lcom/roblox/client/app/a$b;->a:Lcom/roblox/client/app/a;

    invoke-static {v0}, Lcom/roblox/client/app/a;->a(Lcom/roblox/client/app/a;)Lcom/roblox/client/app/a$d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/client/app/a$d;->Q()V

    return-void
.end method
