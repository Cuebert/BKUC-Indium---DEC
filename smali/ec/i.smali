.class public final synthetic Lec/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lec/j;

.field public final synthetic o:Lcom/roblox/audio/a$b;


# direct methods
.method public synthetic constructor <init>(Lec/j;Lcom/roblox/audio/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec/i;->n:Lec/j;

    iput-object p2, p0, Lec/i;->o:Lcom/roblox/audio/a$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lec/i;->n:Lec/j;

    iget-object v1, p0, Lec/i;->o:Lcom/roblox/audio/a$b;

    invoke-static {v0, v1}, Lec/j;->m(Lec/j;Lcom/roblox/audio/a$b;)V

    return-void
.end method
