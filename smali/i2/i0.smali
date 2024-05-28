.class public final synthetic Li2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/m0$b;


# instance fields
.field public final synthetic a:Li2/m0;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Li2/m0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/i0;->a:Li2/m0;

    iput-wide p2, p0, Li2/i0;->b:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Li2/i0;->a:Li2/m0;

    iget-wide v1, p0, Li2/i0;->b:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Li2/m0;->w0(Li2/m0;JLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
