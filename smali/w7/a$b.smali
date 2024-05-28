.class Lw7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lw7/a;


# direct methods
.method constructor <init>(Lw7/a;)V
    .locals 0

    iput-object p1, p0, Lw7/a$b;->a:Lw7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public start()V
    .locals 2

    new-instance v0, Ly8/b;

    invoke-direct {v0}, Ly8/b;-><init>()V

    new-instance v1, Lw7/a$b$a;

    invoke-direct {v1, p0}, Lw7/a$b$a;-><init>(Lw7/a$b;)V

    invoke-virtual {v0, v1}, Ly8/b;->b(Ly8/b$b;)V

    return-void
.end method
