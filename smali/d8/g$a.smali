.class Ld8/g$a;
.super Lc8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld8/g;->a(Landroid/net/Uri;)Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Ld8/g;


# direct methods
.method constructor <init>(Ld8/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ld8/g$a;->o:Ld8/g;

    iput-object p2, p0, Ld8/g$a;->n:Ljava/lang/String;

    invoke-direct {p0}, Lc8/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getColumnNames()[Ljava/lang/String;
    .locals 1

    const-string v0, "user_agent_param"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Ld8/g$a;->n:Ljava/lang/String;

    return-object p1
.end method
