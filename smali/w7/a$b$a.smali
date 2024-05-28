.class Lw7/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw7/a$b;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw7/a$b;


# direct methods
.method constructor <init>(Lw7/a$b;)V
    .locals 0

    iput-object p1, p0, Lw7/a$b$a;->a:Lw7/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly8/f;)V
    .locals 1

    iget-object p1, p0, Lw7/a$b$a;->a:Lw7/a$b;

    iget-object p1, p1, Lw7/a$b;->a:Lw7/a;

    const-string v0, "UserSelectedTheme"

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/c;->d(Ljava/lang/String;)V

    return-void
.end method
