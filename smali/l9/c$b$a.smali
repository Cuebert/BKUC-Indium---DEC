.class Ll9/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll9/c$b;->executeRoblox(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Ll9/c$b;


# direct methods
.method constructor <init>(Ll9/c$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ll9/c$b$a;->o:Ll9/c$b;

    iput-object p2, p0, Ll9/c$b$a;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ll9/c$b$a;->o:Ll9/c$b;

    iget-object v0, v0, Ll9/c$b;->a:Ll9/c;

    iget-object v1, p0, Ll9/c$b$a;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll9/c;->d(Ljava/lang/String;)V

    return-void
.end method
