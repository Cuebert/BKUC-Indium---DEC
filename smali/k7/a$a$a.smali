.class Lk7/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk7/a$a;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Lk7/a$a;


# direct methods
.method constructor <init>(Lk7/a$a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lk7/a$a$a;->o:Lk7/a$a;

    iput-object p2, p0, Lk7/a$a$a;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lk7/a$a$a;->o:Lk7/a$a;

    iget-object v0, v0, Lk7/a$a;->a:Lk7/a;

    iget-object v1, p0, Lk7/a$a$a;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lk7/a;->a(Ljava/lang/String;)V

    return-void
.end method
