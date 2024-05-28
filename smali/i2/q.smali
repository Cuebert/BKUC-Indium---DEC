.class public final synthetic Li2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/m0$b;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ld2/c$b;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ld2/c$b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/q;->a:Ljava/lang/String;

    iput-object p2, p0, Li2/q;->b:Ld2/c$b;

    iput-wide p3, p0, Li2/q;->c:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Li2/q;->a:Ljava/lang/String;

    iget-object v1, p0, Li2/q;->b:Ld2/c$b;

    iget-wide v2, p0, Li2/q;->c:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, v3, p1}, Li2/m0;->e0(Ljava/lang/String;Ld2/c$b;JLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
