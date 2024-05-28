.class Lcom/roblox/client/signup/a$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/signup/a$l;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/signup/a$l;


# direct methods
.method constructor <init>(Lcom/roblox/client/signup/a$l;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v1, v1, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->M2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/components/RbxProgressButton;

    move-result-object v1

    sget-object v2, Lcom/roblox/client/components/RbxProgressButton$j;->o:Lcom/roblox/client/components/RbxProgressButton$j;

    iget-object v3, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v3, v3, Lcom/roblox/client/signup/a$l;->n:Landroid/content/Context;

    sget v4, Lcom/roblox/client/c0;->W1:I

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Object;

    invoke-static {v3, v4, v6}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/roblox/client/components/RbxProgressButton;->z(Lcom/roblox/client/components/RbxProgressButton$j;Ljava/lang/String;)V

    .line 2
    iget-object v1, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v1, v1, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/roblox/client/signup/a;->P2(Lcom/roblox/client/signup/a;J)J

    .line 3
    new-instance v1, Lcom/roblox/client/signup/c;

    iget-object v2, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v2, v2, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    .line 4
    invoke-static {v2}, Lcom/roblox/client/signup/a;->Q2(Lcom/roblox/client/signup/a;)I

    move-result v7

    iget-object v2, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v2, v2, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    .line 5
    invoke-static {v2}, Lcom/roblox/client/signup/a;->j3(Lcom/roblox/client/signup/a;)I

    move-result v8

    iget-object v2, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v2, v2, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    .line 6
    invoke-static {v2}, Lcom/roblox/client/signup/a;->h3(Lcom/roblox/client/signup/a;)I

    move-result v9

    iget-object v2, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v2, v2, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    .line 7
    invoke-static {v2}, Lcom/roblox/client/signup/a;->f3(Lcom/roblox/client/signup/a;)I

    move-result v10

    iget-object v2, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v2, v2, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    .line 8
    invoke-static {v2}, Lcom/roblox/client/signup/a;->R2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v11

    iget-object v2, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v2, v2, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    .line 9
    invoke-static {v2}, Lcom/roblox/client/signup/a;->H2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v12

    iget-object v2, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v2, v2, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    .line 10
    invoke-static {v2}, Lcom/roblox/client/signup/a;->J2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v13

    iget-object v2, v0, Lcom/roblox/client/signup/a$l$a;->n:Lcom/roblox/client/signup/a$l;

    iget-object v14, v2, Lcom/roblox/client/signup/a$l;->p:Ljava/lang/String;

    iget-object v15, v2, Lcom/roblox/client/signup/a$l;->q:Ljava/lang/String;

    iget-object v2, v2, Lcom/roblox/client/signup/a$l;->r:Lcom/roblox/client/signup/a;

    .line 11
    invoke-static {v2}, Lcom/roblox/client/signup/a;->S2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/d$a;

    move-result-object v16

    move-object v6, v1

    invoke-direct/range {v6 .. v16}, Lcom/roblox/client/signup/c;-><init>(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/signup/d$a;)V

    new-array v2, v5, [Ljava/lang/Void;

    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
